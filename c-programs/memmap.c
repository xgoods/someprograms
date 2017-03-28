#include <stdio.h>
#include <stdlib.h>
//Brian Goodwin

void printMap(int argc, char **argv) 
{
	int i=0;
	printf("argc: addr=%x val=%x\n",&argc,argc);
	printf("argv: addr=%x val=%x\n\n",&argv,argv);

	while (*argv) 
	{
		printf("arg%d: argv=%x [ *argv=%x == &(**argv)=%x ] **argv=%x **argv=%c *argv=%s\n",\
		i++,argv,*argv,&(**argv),**argv,**argv,*argv);
		argv++;
	}
	printf("arg%d: argv=%x [ *argv=%x == &(**argv)=%x ]\n", i++, argv, *argv, &(**argv));

}


int main(int argc, char **argv)
{
	printMap(argc,argv);
}
