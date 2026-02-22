Questions :
1. Name two characteristics of a class or object!

2. Pay attention to the Mahasiswa class in Practicum 1, how many attributes do the Student class have? Mention what the attributes are!

3. How many methods does the class have? Mention what the methods are!

4. Pay attention to the method updateIpk contained in the Mahasiswa class. Modify the
content of the method so that the GPA entered is valid, namely first checking whether the
GPA entered is in the range of 0.0 to 4.0 (0.0 <= GPA <= 4.0). If the GPA is not in that range,
the message is issued: "GPA is invalid. Must be between 0.0 and 4.0".

5. Explain how the nilaiKinerja() method works in evaluating student performance, what
criteria are used to determine the performance value, and what is returned by the nilaiKinerja() method?

6. Commit and push program code to Github

Answer :

1. Attributes (properties): data owned by the object

Methods (functions): actions the object can perform

2. it got 4 attributes : Nama , Nim , kelas , ipk

3. it have 6 methods : Mahasiswa3(), Mahasiswa3(String nama, String nim, String kelas, Double ipk), tampilkanInformasi(), ubahKelas(String KelasBaru), updateIPK(double ipkbaru), nilaiKinerja()

4. Done

5. The nilaiKinerja() method checks the student’s GPA (IPK) and determines the performance level.

It uses if–else statements to compare the GPA value with certain ranges.

If the GPA is 3.5 or higher, it returns "Kinerja sangat baik"
If the GPA is 3.0–3.49, it returns "Kinerja Baik"
If the GPA is 2.5–2.99, it returns "Kinerja Cukup"
If the GPA is below 2.5, it returns "Kinerja Kurang"
The method returns a String as the result of the evaluation

6. Done
