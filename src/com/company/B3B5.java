package com.company;

public class B3B5 {
    //метод реализовывает логическое кодирование (скреблирования)
    //в качестве полинома был взят B[i] = A[i] ⊕ B[i-3] ⊕ B[i-5]
    //где A[i] бит исходного двоичного кода под индексом i
    //количество битов в исходном коде = 96
    public static void main(String[] args) {
        String str = "110001101110111011101011111001001110111011111000111011101110001011010101001011101100011000101110";
        StringBuilder result = new StringBuilder();
        String a = "";
        String b1 = "";
        String b2 = "";
        for(int i =0; i < 96; i++){
            if(i >= 5){
                b1 = result.substring(i-3, i-2);
                b2 = result.substring(i-5, i-4);
                a = str.substring(i, i+1);
                result.append(a.charAt(0) - '0' ^ b1.charAt(0) - '0' ^ b2.charAt(0) - '0');
                System.out.println("B[" +(i+1)+ "] = A[" +(i+1)+ "] ^ B[i-3] ^ B[i-5] = " + result.charAt(i));
            }else if(i >= 3){
                a = str.substring(i, i+1);
                b1 = result.substring(i-3, i-2);
                result.append(a.charAt(0)^b1.charAt(0));
                System.out.println("B[" +(i+1)+ "] = A[" +(i+1)+ "] ^ B[i-3] = " + result.charAt(i));
            }else{
                result.append(str.charAt(i));
                System.out.println("B[" +(i+1)+ "] = A[" +(i+1)+ "] = " + result.charAt(i));
            }
        }
        System.out.println("RESULT: " + result);
    }
}
