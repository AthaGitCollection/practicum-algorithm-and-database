package Jobsheet3Week3;

public class DataDosen03 {

    void dataAllDosen(Dosen03[] arrayOfDosen) {
        for (Dosen03 d : arrayOfDosen) {
            System.out.println("Code  : " + d.code);
            System.out.println("Name  : " + d.name);
            System.out.println("Gender: " + (d.gender ? "Male" : "Female"));
            System.out.println("Age   : " + d.age);
            System.out.println("----------------------------");
        }
    }

    void numberOfLecturersPerGender(Dosen03[] arrayOfDosen) {
        int male = 0;
        int female = 0;

        for (Dosen03 d : arrayOfDosen) {
            if (d.gender) {
                male++;
            } else {
                female++;
            }
        }

        System.out.println("Number of Male Lecturers   : " + male);
        System.out.println("Number of Female Lecturers : " + female);
    }

    void AverageAgeOfLecturersPerGender(Dosen03[] arrayOfDosen) {
        int totalMale = 0, totalFemale = 0;
        int countMale = 0, countFemale = 0;

        for (Dosen03 d : arrayOfDosen) {
            if (d.gender) {
                totalMale += d.age;
                countMale++;
            } else {
                totalFemale += d.age;
                countFemale++;
            }
        }

        if (countMale > 0)
            System.out.println("Average Male Age : " + (totalMale / countMale));

        if (countFemale > 0)
            System.out.println("Average Female Age : " + (totalFemale / countFemale));
    }

    void infoDosenPalingTua(Dosen03[] arrayOfDosen) {
        Dosen03 oldest = arrayOfDosen[0];

        for (Dosen03 d : arrayOfDosen) {
            if (d.age > oldest.age) {
                oldest = d;
            }
        }

        System.out.println("Oldest Lecturer");
        System.out.println("Code : " + oldest.code);
        System.out.println("Name : " + oldest.name);
        System.out.println("Age  : " + oldest.age);
    }

    void infoDosenMostYoungest(Dosen03[] arrayOfDosen) {
        Dosen03 youngest = arrayOfDosen[0];

        for (Dosen03 d : arrayOfDosen) {
            if (d.age < youngest.age) {
                youngest = d;
            }
        }

        System.out.println("Youngest Lecturer");
        System.out.println("Code : " + youngest.code);
        System.out.println("Name : " + youngest.name);
        System.out.println("Age  : " + youngest.age);
    }
}