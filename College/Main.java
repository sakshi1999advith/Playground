#include<iostream>
#include <cstdlib> 
#include <cstring>
using namespace std;
struct College
{
	char name[100];
	char city[100];
	int establishmentYear;
	float passPercentage;
};
int comparator(const void* p, const void* q) 
{ 
    return strcmp(((struct College*)p)->name, 
                  ((struct College*)q)->name); 
} 
int main()
{
	int n,i;
	cout<<"Enter the number of colleges";
	cin>>n;
	College s1[n];
	for(i=0;i<n;i++)
	{
		cout<<"\nEnter the details of college "<<i+1;
		cout<<"\nEnter name";
		cin>>s1[i].name;
		cout<<"\nEnter city";
		cin>>s1[i].city;
		cout<<"\nEnter year of establishment";
		cin>>s1[i].establishmentYear;
		cout<<"\nEnter pass percentage";
		cin>>s1[i].passPercentage;
	}
	qsort(s1, n, sizeof(struct College), comparator);
	cout<<"\nDetails of colleges";
	for(i=0;i<n;i++)
	{
		cout<<"\nCollege:"<<i+1;
		cout<<"\nName:"<<s1[i].name;
		cout<<"\nCity:"<<s1[i].city;
		cout<<"\nYear of establishment:"<<s1[i].establishmentYear;
		cout<<"\nPass percentage:"<<s1[i].passPercentage;
	}

}