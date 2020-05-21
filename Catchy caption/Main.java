#include<iostream>
using namespace std;
int main()
{
	string s1;
	int count=0;
	getline(cin,s1);
	for (int i=0;i<s1.length();i++)
	{
		if (s1[i]==' ')
			count++;
	}
	if (count<=9)
		cout<<"Caption eligible for the contest";
	else 
		cout<<"Caption not eligible for the contest";
}