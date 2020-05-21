#include<iostream>
int main()
{
  int n,r=1;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    r=r*i;
  }
  std::cout<<r;
}