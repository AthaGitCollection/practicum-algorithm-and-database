## 3.2.3 Question :

1.	Based on test 3.2, does a class that will create an array of objects always have to have both attributes and methods ? Explain!

2.	What does the following program code do?
 
3.	Does the Student class have a constructor? If not, why is the constructor called in the following line of the program?

4.	What does the following program code do?

5.	the Student and StudentDemo classes separated in test 3.2?

Answer :
1. No, a class that creates an array of objects does not always have to contain both attributes and methods.

2. The program creates an array that can store three objects of the Mahasiswa class.

3. Yes, the Student (Mahasiswa) class still has a constructor even if it is not explicitly written.

4. The program creates a Mahasiswa object and assigns values to its attributes.

5. Yes, the Student and StudentDemo classes are separated in test 3.2.

## 3.3.3 Question :
1. Add the printInfo() method to the Student class then modify the program code in step no. 3.

2.	Suppose you have a new array array of type Students named myArrayOfStudents . Why does the following code cause an error?

Answer : 

1. Done
2. The code causes an error because the array elements have not been initialized as objects before accessing their attributes.

## 3.4.3 Question : 
1.	Can a class have more than 1 constructor? If yes, give an example.

2.	Add the addData() method to the Matakuliah class , then use this method in the MatakuliahDemo class to add Course data.

3.	Add the printInfo() method to the Matakuliah class , then use this method in the MatakuliahDemo class to display the input data on the screen.

4.	Modify the program code in the MatakuliahDemo class so that the length (number of elements) of the array of Matakuliah objects is determined by the user via input with Scanner

Answer : 
1. Yes, a class can have more than one constructor. This concept is called constructor overloading 
Example : public class Matakuliah03 {
    String kode;
    String nama;
    int sks;
    int jumlahJam;

    Matakuliah03() {
    }

    Matakuliah03(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

}

2. Done

3. Done

4. Done
