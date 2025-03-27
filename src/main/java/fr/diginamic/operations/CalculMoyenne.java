package fr.diginamic.operations;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CalculMoyenne {
    private double[] nums = new double[1];

    public void Ajout(double a){
        boolean arrayFUll = false;
        for(double n: this.nums){
            if (n != 0.00){
                arrayFUll = true;
            }
        }
        if(arrayFUll){
            double[] newNums = new double[this.nums.length + 1];
            for(int i = 0; i < this.nums.length; i++){
                newNums[i] = this.nums[i];
            }
            this.nums = null;
            this.nums = Arrays.copyOf(newNums, newNums.length);
            newNums = null;
        }

        for(int i = 0; i < this.nums.length; i++){
            if(this.nums[i] == 0.00){
                this.nums[i] = a;
            }
        }
    }

    public double Calcul(){
        double sum = 0.00;
        for(double n: this.nums){
            sum += n;
        }

        return sum/this.nums.length;
    }
}
