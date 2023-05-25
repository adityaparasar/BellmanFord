#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

// A structure to represent a Jobs
typedef struct Jobs {
   char id; // Jobs Id
   int dead; // Deadline of Jobs
   int profit; // Profit if Jobs is over before or on deadline
} Jobs;

// This function is used for sorting all Jobss according to
// profit
int compare(const void* a, const void* b){
   Jobs* temp1 = (Jobs*)a;
   Jobs* temp2 = (Jobs*)b;
   return (temp2->profit - temp1->profit);
}

// Find minimum between two numbers.
int min(int num1, int num2){
   return (num1 > num2) ? num2 : num1;
}
int main(){
   Jobs arr[] = { { '1', 1, 3 },
      { '2', 3, 5 },
      { '3', 4, 20 },
      { '4', 3, 18 },
      { '5', 2, 1 },
      { '6', 4, 6 },
      { '7', 2, 30}
   };
   int n = sizeof(arr) / sizeof(arr[0]);
   printf("Following is maximum profit sequence of Jobs \n");
   qsort(arr, n, sizeof(Jobs), compare);
   int result[n]; // To store result sequence of Jobs
   bool slot[n]; // To keep track of free time slots

   // Initialize all slots to be free
   for (int i = 0; i < n; i++)
      slot[i] = false;

   // Iterate through all given Jobs
   for (int i = 0; i < n; i++) {

      // Find a free slot for this Job
      for (int j = min(n, arr[i].dead) - 1; j >= 0; j--) {

         // Free slot found
         if (slot[j] == false) {
            result[j] = i;
            slot[j] = true;
            break;
         }
      }
   }

   // Print the result
   for (int i = 0; i < n; i++)
      if (slot[i])
         printf("%c ", arr[result[i]].id);
   return 0;
}