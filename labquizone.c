#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int size=0;
int serialNo=0;

struct Node
{
		char data[20];
		int serial_no;
		struct Node *next;
		
};

struct Node *head=NULL;

void enqueue(char v[])
{
	if(head == NULL)
	{
		struct Node *n = malloc(sizeof(struct Node));
		strcpy(n->data, v);
		n->next = NULL;
		n->serial_no = ++serialNo;
		head = n;
		size++;
		
	}
	else
	{
		struct Node *n = malloc(sizeof(struct Node));
		strcpy(n->data, v);
		n->next = NULL;
		n->serial_no = ++serialNo;
		
		struct Node *temp=head;
		while(temp->next != NULL)
		{
			temp = temp->next;
		}
		temp->next = n;
		size++;
	}
}
int dequeue()
{
	if(head == NULL)
	{
		printf("    Queue is empty yet");
		return 0;
	}
	else if(size == 1)
	{
		struct Node *temp=head;
		head= NULL;
		size--;
		return 1;
	}
	else
	{
		struct Node *temp=head;
		head = temp->next;
		size--;
		return 1;
	}
}
void show()
{
	if(head != NULL)
	{
	
		struct Node *temp = head;
		while(temp !=NULL)
		{
			printf("( %s, %d ),",temp->data, temp->serial_no);
			temp=temp->next;
		}
	}
}
int main()
{
	char option;
	
	while(1)
	{
		system("@cls||clear");
		printf("\n\n\n\t\t///////////////////////////////////////////////////////////////////// ");
		printf("\n\t\t Press 'e' to enter a new customer to add into the linked list");
		printf("\n\t\t Press 'r' to remove a customer from the list");
		printf("\n\t\t Press 'x' to exit");
		printf("\n\t\t///////////////////////////////////////////////////////////////////// \n\n");
		show();
		printf("\n\n\tEnter your choice : ");
		scanf(" %c",&option);
		
		switch(option)
		{
			case 'e':
			{
				char name[20];
				printf("\n\nEnter Name : ");
				fgets(name,20,stdin);
				
			    if ((strlen(name) > 0) && (name[strlen (name) - 1] == '\n'))
			        name[strlen (name) - 1] = '\0';
				enqueue(name);
				printf("\nsuccessfully inserted");
				system("pause");
				break;
			}
			case 'r':
			{
				int flag=dequeue();
				if(flag==0)
				{
					system("pause");
					break;
				}
				else
				{
					printf("\noperation successfull");
					system("pause");
					break;
				}
			}
			case 'x':
			{
				exit(0);
			}
			default :
			{
					printf("\nWrong input");
					system("pause");
					break;
					
			}
		}
	}
}
