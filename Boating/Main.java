#include<iostream>
using namespace std;
int main()
{
  int t,a,c,d;
  std::cin>>t>>a>>c;
  d=a*75+c*30;
  if(t>d)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}