#include <bits/stdc++.h>
using namespace std;

const char dialPad[10][5]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

void print(string num,string out){
    string newOut;
    for(int i=0;dialPad[num[0]-48][i]!='\0';i++){
        newOut.clear();
        newOut=out+dialPad[num[0]-48][i];
        if(num.length()<=1){
            cout<<newOut<<',';
            continue;
        }
        print(num.substr(1),newOut);
    }
}

int main()
{
    int n;
    string line="";
    cin>>n;
    cin>>ws;
    for(int i=0;i<n;i++){
        getline(cin,line);
        print(line,"");
        cout<<"\b \n";
    }
    return 0;
}
