//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //задача 1
        var dog = 8.0;
        System.out.println("dog=" + dog);
        var cat = 3.6;
        System.out.println("cat=" + cat);
        var paper = 763789;
        System.out.println("paper=" + paper);
        //задача2
        var dog2 = dog + 4;
        System.out.println("dog+4="+ dog2);
        var cat2 = cat + 4;
        System.out.println("cat+4="+ cat2);
        var paper2 = paper + 4;
        System.out.println("paper+4="+ paper2);
        //задача3
        var dog3 = dog - 3.5 ;
        System.out.println("dog3-3.5="+ dog3);
        var cat3 = cat - 1.6;
        System.out.println("cat3-1.6="+ cat3);
        var paper3 = paper - 7639;
        System.out.println("paper3="+ paper3);
        //задача4
        var friend  = 19;
        System.out.println("friend="+ friend);
        var friend2 = friend + 2;
        System.out.println("friend2="+ friend2);
        var friend3 = friend2 / 7;
        System.out.println("friend3="+ friend3);
        //задача5
        var frog= 3.5;
        System.out.println("frog="+ frog);
        var frog2= frog * 10;
        System.out.println("frog2"+ frog2);
        var frog3= frog2/3.5;
        System.out.println("frog3="+ frog3);
        var frog4 = frog3 + 4;
        System.out.println("frog4="+ frog4);
        //задача6
        var theBoxer1= 78.2;
        var theBoxer2= 82.7;
        var sumbox= theBoxer1+theBoxer2;
        System.out.println("Сумма боксёров=" +sumbox);
        var diference= theBoxer2-theBoxer1 ;
        System.out.println("Разница веса боксёров=" +diference);
        //задача7

        var procent = diference/theBoxer1*100 ;
        System.out.println("Разница в процентах между боксёрами="+ procent);
        //задача8.1
        var time = 640;
        System.out.println("общее колличество часов="+ time);
        var timePerEmployee=8;
        System.out.println("Время на одного сотрудника="+ timePerEmployee);
        var numberOfEmployees = time / timePerEmployee;
        System.out.println("Колличество сотрудников в компании="+numberOfEmployees);
        //8.2
        var anotherCompany = numberOfEmployees +94;
        System.out.println("Колличество сотрудников в другой компании="+anotherCompany);
        var timeForEmployeesOfAnotherCompany= time / anotherCompany;
        System.out.println("Колличество часов на одного сотрудника в другой компании="+timeForEmployeesOfAnotherCompany);


    }
}

