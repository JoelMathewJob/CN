#include<iostream>
#include<string>

using namespace std;

string crc(string data, string key){
  int datalen = data.length();
  int keylen = key.length();
  string temp = data;

  temp.append(keylen-1, '0');

  for(int i=0; i<=datalen-1; i++){
    if(temp[i] == '1'){
      for(int j =0; j<=keylen-1; j++){
        temp[i+j] = temp[i+j] == key[j] ? '0' : '1';
      }
    }
  }

 return temp.substr(datalen, keylen-1);
  
  
}

int main(){
  string data, key;
  cout << "enter the dataword\n";
  cin >> data;
  cout << "enter the key\n";
  cin >> key;

  string rem = crc(data, key);
  cout<< "data: "<< data <<endl;
  cout<< "key: "<< key <<endl;
  cout<< "crc: "<< rem <<endl;
  cout<< "dataword: "<< data + rem <<endl;

  return 0;
}
