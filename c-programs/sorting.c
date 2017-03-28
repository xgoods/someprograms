/* HW6 read cafefully and follow all the instructions/comments
   this program compiles and runs as is although it's not doing much.
   DO NOT CHANGE THE SEED. Changing seed gives a different sequence of
   numbers but we want the same numbers for comparison purposes.
   FLOATING point radix sort requires some substantial changes to this code
   float n, lst[N],tmp[N];
*/
//Brian Goodwin

#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <time.h>
#include <stdint.h>

#define OK 1
#define NOK 0
#define NELM 1000 /* default 100 elements */
#define N 1048576 /* 2^30 or 1 meg elements  */
#define BIN 256
#define LST 1
#define MAXBIT 32
//#define N 2097152
//#define N 4194304
//#define N 8388608
//#define N 16777216
//#define N 33554432

void selection_sort();
void swap();

void merge_sort();
void msort_recursive();

void radix_sort();
void float_radix_sort();
void swap();
void self_check();

int rand(void);
void srand();
int rand_r();
void init_lst();
void print_lst();
void gettimeofday();
double get_time();

void sort();

int n,flag, lst[N], tmp[N], group, buf[N], count[BIN], map[BIN];

int main(int argc, char *argv[])
{
	long int del_sec, del_msec;
	group=8;
	int i;
	double total_time;
	FILE *f=fopen("dataN10.dat","a");
    struct timeval tv_s, tv_e;
    if (argc > 1) {
      n = atoi(argv[1]);
    } else {
      n = NELM;
    }
	printf("n=%d\n",n);
    init_lst(lst, n);
    
	printf("Selection sort:\n");
	clock_t begin = clock();
	selection_sort(lst,n);
	clock_t end = clock();
	total_time=get_time(begin, end);
	printf("%f seconds\n",total_time);
	printf("%f miliseconds\n",total_time*1000);
	
	
	printf("Merge sort:\n");
	begin = clock();
	msort_recursive(lst,0,n-1);
	end = clock();
	total_time=get_time(begin, end);
	printf("%f seconds\n",total_time);
	printf("%f miliseconds\n",total_time*1000);
	
	
	printf("Radix sort:\n");
	begin=clock();
	radix_sort(i);
	
	end=clock();
	total_time=get_time(begin, end);
	printf("%f seconds\n",total_time);
	printf("%f miliseconds\n",total_time*1000);
	
	self_check(lst,n);

	return 0;
}

double get_time(clock_t begin, clock_t end)
{
	double time_spent;
	time_spent=(double)(end-begin)/CLOCKS_PER_SEC;
	
	return time_spent;
}

void selection_sort(int list[], int n)
{
	int i;
	int j;
	
	for(i=0; i<n-1; i++)
	{
		int min = i;
		for(j=i+1; j<n; j++)
		{
			if(list[min] > list[j])
			{
				min=j;
			}
		}
		if(min != i)
		{
			int tmp = list[i];
			list[i] = list[min];
			list[min] = tmp;
		}
	}
}

void merge_sort(int list[], int l, int m, int r)
{
	int i;
	int j;
	int k;

	int n1=m-l+1;
	int n2=r-m;

	int L[n1];
	int R[n2];

	for(i=0; i<n1; i++)
	{
		L[i]=list[l+i];
	}
	for(j=0; j<n2; j++)
	{
		R[j]=list[m+1+j];
	}
	
	i=0;
	j=0;
	k=l;
	
	while(i<n1 && j<n2)
	{
		if(L[i] <= R[j])
		{
			list[k]=L[i];
			i++;
		}
		else
		{
			list[k]=R[j];
			j++;
		}
		k++;
	}
	
	while(i<n1)
	{
		list[k]=L[i];
		i++;
		k++;
	}
	
	while(j<n2)
	{
		list[k]=R[j];
		j++;
		k++;
	}
}

void msort_recursive(int list[], int l, int r)
{
	if(l<r)
	{
		int m=l+(r-l)/2;
		
		msort_recursive(list,l,m);
		msort_recursive(list,m+1,r);
		
		merge_sort(list,l,m,r);
	}
	else
	{
		return;
	}
}

void radix_sort(int group)
{
	int i,j,k,mask;
	int *src;
	int *dst;
	mask=BIN-1;
	
	if(flag==LST)
	{
		src=lst;
		dst=buf;
	}
	else
	{
		src=buf;
		dst=lst;
	}
	
	for(i=0;i<BIN;i++)
	{
		count[(src[i] >> (group*8))&mask]++;
	}
	
	map[0]=0;
	for(j=1; j<BIN; j++)
	{
		map[j]=map[j-1]+count[j-1];
	}
	
	for(k=0; k<N; k++)
	{
		dst[map[(src[k] >> (group*8))&mask]++]=src[k];
	}
}

void print_lst(int *l, int n)
{
	int i;
    for (i = 0; i < n; i++) { printf("%d\n", l[i]); }
    printf("\n");
}

void init_lst(int *l, int n)
{
	int i;
    int seed = time(0) % 100; /* seconds since 1/1/1970 */
    // printf ("seed=%d\n", seed);
    srand(1234); /* SEED */
    for (i = 0; i < n; i++) 
    {
        l[i] = rand();
    }
}

void self_check (int *list, int n) 
{
    int i, j, flag=OK, *listp;
    listp = list;
    for (i = 0; i < n-1; i++) 
    {
        if (listp[i] > listp[i+1]) 
        {
            flag = NOK;
            break;
        }
    }
    if (flag == OK) printf("sorted\n");
    else printf("NOT sorted at %d\n",i);
}
