#include<stdio.h> 
#include<string.h>
#include<stdlib.h> 
   

FILE *fout;
struct node 
{ 
    char* key; 
    struct node *left, *right; 
}; 
   
struct node *newNode(char* item) 
{ 
	
    struct node *temp =  (struct node *)malloc(sizeof(struct node)); 
    
    char* tempvalu=malloc(sizeof(char)*strlen(item)+1);
    
    strcpy(tempvalu,item);
    temp->key = tempvalu; 
    temp->left = temp->right = NULL; 
    
    return temp; 
} 

void inorder(struct node *root) 
{ 
    if (root != NULL) 
    { 
        inorder(root->left); 
        printf("   %s", root->key); 
        fprintf(fout,"   %s", root->key); 
        inorder(root->right); 
    } 
} 
void preorder(struct node *treeNode)
{
	if(treeNode != NULL)
	{
		printf("   %s",treeNode->key);
		fprintf(fout,"   %s",treeNode->key);
		preorder(treeNode->left);
		preorder(treeNode->right);
	}
}
void postorder(struct node* treeNode)
{
	if(treeNode != NULL)
	{
		postorder(treeNode->left);
		postorder(treeNode->right);
		printf("   %s",treeNode->key);
		fprintf(fout,"   %s",treeNode->key);
	}
}
struct node* search(struct node* r,char* v)
{
	struct node* temp = r;
	if(temp == NULL)
	{
		return NULL;
	}
	else if(strcmp(v,temp->key) == 0)
	{
		return temp;
	}
	else if(temp->left==NULL && temp->right==NULL)
	{
		return NULL;
	}
	else if(v[0] <= temp->key[0])
	{
		struct node* temp1= temp->left;
		return search(temp1,v);	
	}
	else if(v[0]>temp->key[0])
	{
		struct node* temp1= temp->right;
		return search(temp1,v);
	}
}
/* A utility function to insert a new node with given key in BST */
struct node* insert(struct node* node, char* key) 
{ 
    /* If the tree is empty, return a new node */
    if (node == NULL) return newNode(key); 
  
    /* Otherwise, recur down the tree */
    if (key[0] < node->key[0]) 
        node->left  = insert(node->left, key); 
    else if (key[0] > node->key[0]) 
        node->right = insert(node->right, key); 
    else if (key[1] < node->key[1]) 
        node->left  = insert(node->left, key); 
    else if (key[1] > node->key[1]) 
        node->right = insert(node->right, key);    
  
    /* return the (unchanged) node pointer */
    return node; 
} 
struct node * minValueNode(struct node* node) 
{ 
    struct node* current = node; 
  
    /* loop down to find the leftmost leaf */
    while (current->left != NULL) 
        current = current->left; 
  
    return current; 
} 
struct node* deleteNode(struct node* root, char* key) 
{ 
    // base case 
    if (root == NULL) return root; 
  
   if(strcmp(key,root->key) == 0)
    { 
        // node with only one child or no child 
        if (root->left == NULL) 
        { 
            struct node *temp = root->right; 
            free(root); 
            return temp; 
        } 
        else if (root->right == NULL) 
        { 
            struct node *temp = root->left; 
            free(root); 
            return temp; 
        } 
  
        // node with two children: Get the inorder successor (smallest 
        // in the right subtree) 
        struct node* temp = minValueNode(root->right); 
  
        // Copy the inorder successor's content to this node 
        root->key = temp->key; 
  
        // Delete the inorder successor 
        root->right = deleteNode(root->right, temp->key); 
    } 
    // If the key to be deleted is smaller than the root's key, 
    // then it lies in left subtree 
    else if (key[0] < root->key[0]) 
        root->left = deleteNode(root->left, key); 
  
    // If the key to be deleted is greater than the root's key, 
    // then it lies in right subtree 
    else if (key[0] > root->key[0]) 
        root->right = deleteNode(root->right, key); 
    else if (key[1] < root->key[1]) 
        root->left = deleteNode(root->left, key); 
  
    // If the key to be deleted is greater than the root's key, 
    // then it lies in right subtree 
    else if (key[1] > root->key[1]) 
        root->right = deleteNode(root->right, key); 
  
    return root; 
} 
// Driver Program to test above functions 
int main() 
{
	int i,N,S,D;
    FILE *fp;
    char buff[255];
    fp = fopen("input.txt", "r");
    fout = fopen("output.txt", "w+");
   	
   	fscanf(fp, "%d", &N);
   	fscanf(fp, "%d", &S);
   	fscanf(fp, "%d", &D);
   	
    struct node *root = NULL; 
	fscanf(fp,"%s", &buff);
	root = insert(root,buff);
	
	for(i=1;i<N;i++)
	{
		fscanf(fp,"%s", &buff);
		insert(root,buff);
	}
   
    printf("\nPre Order: ");
    fprintf(fout,"\nPre Order: ");
    preorder(root); 
    printf("\nIn Order: ");
    fprintf(fout,"\nIn Order: ");
    inorder(root); 
    printf("\nPost Order: ");
    fprintf(fout,"\nPost Order: ");
    postorder(root); 
    
    printf("\nSearch Phase:");
    fprintf(fout,"\nSearch Phase:");
	for(i=0;i<S;i++)
	{
		fscanf(fp,"%s", &buff);
		printf("\n%s: ",buff);
		fprintf(fout,"\n%s: ",buff);
	    struct node* temp= search(root,buff);
	    if(temp != NULL)
	    {
	    	printf("Found");
	    	fprintf(fout,"Found");
		}
		else
		{
			printf("Not Found");
			fprintf(fout,"Not Found");
		}
	}
	
    printf("\nDelete Phase:");
    fprintf(fout,"\nDelete Phase:");
	for(i=0;i<D;i++)
	{
		fscanf(fp,"%s", &buff);
		printf("\n%s: ",buff);
		fprintf(fout,"\n%s: ",buff);
		
		struct node* res = deleteNode(root,buff);
		if(res != NULL)
		{
			printf("Deleted");
			fprintf(fout,"Deleted");
		}
		else
		{
			printf("Not Found");
			fprintf(fout,"Not Found");
		}
	}
   
    fclose(fp);
    printf("\nPre Order: ");
    fprintf(fout,"\nPre Order: ");
    preorder(root); 
    printf("\nIn Order: ");
    fprintf(fout,"\nIn Order: ");
    inorder(root); 
    printf("\nPost Order: ");
    fprintf(fout,"\nPost Order: ");
    postorder(root); 
    
    return 0; 
} 
