package MyPracticeWorks;

public class Practice1 {
    public static void main(String[] args) {

//    }
//    // проверяем , что длина строки болтше или равно 3, чтобы избежать ошибки.
//    public boolean mixString(String str){
//        if (str.length() < 3){ //если строка меньше 3 то возвращаем false
//            return false;
//        }
//        //извлекаем подстроку, начиная с индекса 1 (второй символ) до индекса 3(третий символ)
//        String sub = str.substring(1,3);
//
//        //проверяем, равно ли извлеченная подстрока "ix"
//        if (sub.equals("ix")){
//            return true;
//        }else {
//            return false;
//        }
//    }

//public int close10(int a, int b) {
//    //находим расстояние первого числа до 10
//    int diffA = Math.abs(a - 10);
//    //находим расстояние первого числа до 10
//    int diffB = Math.abs(b - 10);
//
//    // сравниваем расстояние чтобы определить какое число ближе
//    if (diffA < diffB) {
//        return a; //если а ближе к 10 то возвращаем а
//    } else if (diffB < diffA) {
//        return b;
//    } else {
//        return 0;
//    }
//}
    }
/*Верните true, если заданная строка содержит от 1 до 3 символов 'e'. В противном случае верните false.

Примеры:
        •	stringE("Hello") → true (1 символ 'e')
        •	stringE("Heelle") → true (2 символа 'e')
        •	stringE("Heelele") → false (4 символа 'e')/*

 */
// public boolean stringE(String str){
//     // считаем количество символов "е" в строке
//     int count = 0;
//
//     // перебираем каждый символ строки
//     for (int i = 0; i < str.length(); i++){
//         //если текущий символ равен 'e' увеличиваем счетчик
//         if (str.charAt(i) == 'e'){
//             count++;
//         }
//     }
//     //проверяем, находится ли количество 'e' в диапозоне от 1 до 3 включительно
//     return (count >= 1 && count <= 3);

    public String everyNth(String str, int n){
        // создаем пустую строку для накоплени результата
        String result = "";

        // перебираем каждый n-ый символ  начиная с индекса 0
        for (int i = 0; i < str.length(); i += n){
            //добавляем текущий символ к результату
            result += str.charAt(i);
        }
        return result;
    }
}