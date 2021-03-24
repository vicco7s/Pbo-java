#include <iostream>
using namespace std;

int main() {
    char kar;
    do
    {
        cout << "masukan Huruf : ";
        cin >> kar;
        if (kar >= 'a' && kar<='z'){
            cout << "karakter " << kar << " termasuk huruf kecil" <<endl;
        } else if (kar >= 'A' && kar <= 'Z'){
            cout << "karakter " << kar << " termasuk huruf Besar" <<endl;
        } else if(kar >= '0' && kar <='9'){
            cout << "karakter " << kar << " termasuk angka" <<endl;
        } else{
            cout << "karakter " << kar << " termasuk huruf khusus" <<endl;
        }
        cout << "masukan [y /n] : ";
        cin >> kar;
    } while (kar == 'y');
    
}