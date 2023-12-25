import characters.*;

/**
 * Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
 * Проанализировать персонажей:
 * "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
 * Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
 * Создать абстрактный класс и иерархию наследников.
 * Расположить классы в пакет так, чтобы в основной программе небыло видно их полей.
 * В не абстрактных классах переопределить метод toString() так чтобы он возвращал название класса или имя.
 * Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.
 */
public class Main {
    public static void main(String[] args) {
        Peasant peasant = new Peasant("Иван Мельников");
        Bandit bandit = new Bandit("Степан Шайка");
        Sniper sniper = new Sniper("Артем Стрелоков");
        Wizard wizard = new Wizard("Елена Волшебная");
        Spearman spearman = new Spearman("Александр Копьеносец");
        Crossbowman crossbowman = new Crossbowman("Наталья Арбалетщица");
        Monk monk = new Monk("Виктория Блаженная");

        System.out.println(peasant);
        System.out.println(bandit);
        System.out.println(sniper);
        System.out.println(wizard);
        System.out.println(spearman);
        System.out.println(crossbowman);
        System.out.println(monk);
    }
}