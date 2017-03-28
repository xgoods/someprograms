#include <linux/kernel.h>
#include <linux/sched.h>
#include <linux/module.h>
#include <linux/string.h>
/*
 * if scheduling policy = 0 its other
 * if scheduling policy = 1 its FIFO
 * if scheduling policy = 2 its RR
*/

/*
 * if state = 0 its runnable
 * if state = >0 its stopped
 * if state = -1 its unrunnable
*/

int init_module(void)
{
  struct task_struct *task;
  
	for_each_process(task)
    {
	  
	  printk("command: %s PID: [%d] PPID: [%i] TGID: [%d] State: %ld Policy: %d \n",task->comm , task->pid, task->real_parent->pid, 
			 task->tgid, task->state, task->policy);
    }
    
   return 0;
}

void cleanup_module(void)
{
  printk(KERN_INFO "Cleaning Up.\n");
}
