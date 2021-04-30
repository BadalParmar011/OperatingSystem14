1. Page Replacement Algorithm

Page Replacements algorithm is one of the most important concepts of the Operating System. The major drawback of any operating system is its speed and memory allocation process. The number of memory calls done to access frequently used pages, is tiresome and affects the speed, accuracy and durability of the computer hardware and the other software present in the system.
To overcome this issue, operating system came up with the concept of virtual memory management. Using the concept of storing the pages in the virtual memory, page replacement algorithms is introduced as a solution to paging issues faced in the operating systems.

2. Disk Scheduling Algorithm

Disk Scheduling is basically used to schedule I/O requests arriving in the system. It is important to schedule the I/O requests because at a time many I/O requests are made, and our disk controller can execute any one of the requests. So, to choose one request out of the others we use various disk scheduling algorithms so that each request is accessed in the minimal time and each request gets executed. Before, moving on to the algorithms let’s have a brief look at the core theory related to this concept:
A disk is a magnetic storage device which has several platters (or surfaces). The entire assembly of platters rotates as a unit at high speeds. The surface of each platter is organised as a concentric group of magnetic tracks on which data can be stored. Each track is divided into several blocks of fixed size in which the data is stored. A block is the smallest amount of data that can be read from or written to the disk in a single I/O operation.
Each disk surface has a read/write head which can move linearly across the surface. Data from the disk is requested by block number. The disk controller moves the head to the correct track and then waits for the correct block to pass underneath it for access.

In project the focus is on the three most important algorithms of the Page Replacement Topic and 6 algorithms of Disk Scheduling Algorithms. We are going to show how the algorithms are implemented, we are going to provide you with algorithm calculator, and a comparison graph simulator, that helps you to compare between all the algorithm for the similar kind of input.
