#include <stdio.h>
#include <time.h>
#include <ctype.h>
#include <stdlib.h>
#include <string.h>

 // LIBRARIES FOR C CHARACTERS AND STRINGS. 

char *sentencecombiner(); // PROTOTYPE FUNCTION WITH POINTER


int main(void) {
  srand(time(NULL)); //SEED RANDOM GENERATOR 
  for (int x=1;x<21;x++){
    char *onesentence=sentencecombiner();//
    puts(onesentence);// PRINTS THE SENTENCE 
    free(onesentence); // FREES THE MEMORY LOCATION
  }
  return 0;
}

char *sentencecombiner()// MAJOR FUNCTION
{
  // STORING ALL THE KEYWORDS IN POINTER ARRAYS
  char *verb[]={"drove", "jumped", "ran", "walked", "flew"};
  char *article []= {"the", "a", "one", "some" ,"any"}; 
  char *nouns[]={"cat", "dog", "truck", "plane","skateboard" };
  char *prepositions[]={"to", "from", "over", "under", "on"};
  
  

  char *onesentence=malloc(sizeof(char)*41);// ALLOCATING THE MAXIMUM CHARACTERS. USED SIMPLE MATH FOR FINDING THE MAXIMUM POSSIBLE CHARACTERS. 
  
  int i = (rand()%5);// RANDOM GENERATOR FOR THE NEXT INPUT

  strcat(onesentence,article[i]); // CONCATENATING THE SENTENCES TOGETHER
  strcat(onesentence, " "); // LEAVING SOME SPACE
   i=(rand()%5);// RANDOM GENERATOR FOR THE NEXT INPUT

   strcat(onesentence,nouns[i]);// CONCATENATING THE SENTENCES TOGETHER
  strcat(onesentence, " ");// LEAVING SOME SPACE
   i=(rand()%5);// RANDOM GENERATOR FOR THE NEXT INPUT

   strcat(onesentence,verb[i]);// CONCATENATING THE SENTENCES TOGETHER
  strcat(onesentence, " ");// LEAVING SOME SPACE
   i=(rand()%5);// RANDOM GENERATOR FOR THE NEXT INPUT

   strcat(onesentence,prepositions[i]);// CONCATENATING THE SENTENCES TOGETHER
  strcat(onesentence, " ");// LEAVING SOME SPACE
   i=(rand()%5);// RANDOM GENERATOR FOR THE NEXT INPUT

   strcat(onesentence,article[i]);// CONCATENATING THE SENTENCES TOGETHER
  strcat(onesentence, " ");// LEAVING SOME SPACE
   i=(rand()%5);// RANDOM GENERATOR FOR THE NEXT INPUT

   strcat(onesentence,nouns[i]);// CONCATENATING THE SENTENCES TOGETHER
  strcat(onesentence, ". ");// ENDING IN DOT.
   i=(rand()%5);// RANDOM GENERATOR FOR THE NEXT INPUT

onesentence[0]= toupper(onesentence[0]);// CAPITALIZING THE FIRST LETTER. 

return onesentence;

}
