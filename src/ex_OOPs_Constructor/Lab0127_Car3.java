package ex_OOPs_Constructor;

public class Lab0127_Car3 {
    String model;
    int year;


    Lab0127_Car3( String model_name, int year_created){
        this(model_name="i 10");

        this.model=model_name;
        this.year=year_created;



    }

    //
    Lab0127_Car3 (String model_name ){
         this.model=model_name;

    }

}
