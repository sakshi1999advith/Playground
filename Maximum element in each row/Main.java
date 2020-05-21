#include <cstdlib>
#include <iostream>
using namespace std;

void rowSum(int arr[10][10] ,int m,int n)
{
   
    
    for(int i = 0; i < m; i++)
    {   int sum=0;
         for(int j = 0; j < n; j++)
         {
            if(sum<arr[i][j])  
              sum=arr[i][j];
        }
        
        cout<<sum<<"\n";     
    }
}

int main(int argc, char** argv) {
    int arr[10][10], m ,n;
    
    cin>>m;
    cin>>n;
    
    //initializing the matrix
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
          cin>>arr[i][j];
         
        }
    }
    rowSum(arr, m, n);
    
    return 0;
}