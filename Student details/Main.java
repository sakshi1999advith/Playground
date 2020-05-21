#include<iostream>
#include <cstdlib> 
#include <cstring>
using namespace std;
struct Student
{
	char name[30];
	char department[20];
	int yearOfStudy;
	float cgpa;
};
int comparator(const void* p, const void* q) 
{ 
    return strcmp(((struct Student*)p)->name, 
                  ((struct Student*)q)->name); 
} 
int main()
{
	int n,i;
	cout<<"Enter the number of students";
	cin>>n;
	Student s1[n];
	for(i=0;i<n;i++)
	{
		cout<<"\nEnter the details of student "<<i+1;
		cout<<"\nEnter name";
		cin>>s1[i].name;
		cout<<"\nEnter department";
		cin>>s1[i].department;
		cout<<"\nEnter year of study";
		cin>>s1[i].yearOfStudy;
		cout<<"\nEnter cgpa";
		cin>>s1[i].cgpa;
	}
	qsort(s1, n, sizeof(struct Student), comparator);
	cout<<"\nDetails of students";
	for(i=0;i<n;i++)
	{
		cout<<"\nStudent "<<i+1;
		cout<<"\nName:"<<s1[i].name;
		cout<<"\nDepartment:"<<s1[i].department;
		cout<<"\nYear of study:"<<s1[i].yearOfStudy;
		cout<<"\nCGPA:"<<s1[i].cgpa;
	}

}