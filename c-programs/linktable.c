//Brian Goodwin

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define LINE_LENGTH 100

struct clip *build_a_lst();
struct clip *append();
//int find_length();
void print_a_lst();
void split_line();

struct clip {
  int views;
  char *user;
  char *id;
  char *title;
  struct clip *next;
} *head;

int main(int argc, char **argv) {
  
  head = build_a_lst(*(argv+1));
  //n = find_length(head);
  //printf("%d clips\n",n);
  print_a_lst(head);		/* prints the table */
  return 0;
}

struct clip *build_a_lst(char *fn) {
  FILE *fp;
  struct clip *hp;
  char *fields[4];
  char line[LINE_LENGTH];
  int cnt=0;
  hp = NULL;
  fp = fopen(fn,"r");
  while(fgets(line, sizeof(line), fp)!= NULL)
  {
	split_line(fields,line);
	hp = append(hp,fields);
  }
  fclose(fp);
  // open fn
  // while no more lines
  // read a line
  // split the line into four substrings/int and store them in a struct
  // append - add the struct at the end of the list
  // return the head pointer holding the list

  return hp;
}

/* fields will have four values stored upon return */
void split_line(char **fields,char *line) {
  int i = 0;
  char *token, *delim;
  delim = ",\n";
  token=strtok(line,delim);
  while(token!=NULL)
  {
	fields[i] = malloc(strlen(token));
	strcpy(fields[i],token);
	token = strtok(NULL,delim);
	++i;
  }
  /* 
     call strtok(line, delim);
     repeat until strtok returns NULL using strtok(NULL, delim);
 */
}

/* set four values into a clip, insert a clip at the of the list */
struct clip *append(struct clip *hp,char **five) {
  struct clip *cp,*tp;
  
  tp = malloc(sizeof(struct clip));

  tp->views = atoi(*five);
  tp->user = malloc(strlen(five[1]));
  strcpy(tp->user, five[1]);

  tp->id = malloc(strlen(five[2]));
  strcpy(tp->id, five[2]);

  tp->title = malloc(strlen(five[3]));
  strcpy(tp->title, five[3]);
  
  cp = hp;
  if(hp==NULL)
  {
     hp = tp;
  } 
  else 
  {
    while(cp->next!=NULL)
	{
      cp = cp->next;
    }
    cp->next = tp;
  }
  
  return hp;
}
  /* 
     malloc tp
     set views using atoi(*five)
     malloc for four strings.
     strcpy four strings to tp
     insert tp at the end of the list pointed by hp
     use cp to traverse the list
 */

  


void print_a_lst(struct clip *cp) {
  int i = 0;
  while(cp->next!=NULL)
  {
    printf("%d,%s,%s,%s\n",cp->views,cp->user,cp->title,cp->id);
    cp = cp->next;
    i++;
  }
  /*
     use a while loop and the statement below to print the list
     printf("%d,%s,%s,%s,%s\n",cp->views,cp->user,cp->id,cp->title,cp->time);
  */
}

/* end */
