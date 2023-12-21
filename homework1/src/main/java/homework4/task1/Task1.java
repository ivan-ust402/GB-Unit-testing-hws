package homework4.task1;

public class Task1 {
//    Задание 1. Ответьте письменно на вопросы:
//
//1)  Почему использование тестовых заглушек может быть полезным
// при написании модульных тестов?

//  Допустим мы тестируем какой-то класс, но, чтобы задействовать его функционал,
//  требуется создавать созависимый класс, который нам не нужно тестировать,
//  но который допустим необходим для обращения к базе данных,
//  чтобы иммитировать работу данного класса, мы делаем дополнительный класс
//  имплементируемый от реального, который
//  будет иммитировать обращения к базе данных, методы и сам объект БД в нем подменяются
//  на заглушки (допустим мы изначально знаем, что должен вернуть тот или иной метод),
//  в нашем случае меняем реальную базу данных на HashMap и упрощаем методы до методов
//  работы с HashMap, тестируя интересующий нас класс, мы проверяем
//  функциональность данного класса, все с теми же запросами к базе данных, однако,
//  за счет иммитирующего класса мы не работаем напрямую с реальной базой данных

//    Заглушка своего рода временное решение, заменяющее настоящий функционал,
//    без потери работоспособности всей системы или приложения

//2) Какой тип тестовой заглушки следует использовать, если вам
// нужно проверить, что метод был вызван с определенными аргументами?

//  mock - фреймворк mokito создает автоматически идентичный объект(mock) от настоящего.
//  mock иммитирует поведение нашего класса, но при этом создает совершенно другой
//  изолированный от всего объект, создает копию нашего класса
//  (физически в программе этого объекта не создается),
//  а далее мы производим иммитацию работы методов в данном классе.
//  Mock предопределяет ожидаемые вызовы методов и их возвращаемые значения.
//  При использовании mock можно задать ожидаемые аргументы и проверить, что метод
//  был вызван с этими аргументами.

//  spy - такие же как mock, предоставляют гибкий контроль над объектом заглушки,
//  но иммет дополнительные свойства: записывает информацию о вызовах методов,
//  включая переданные аргументы, собирает данные о взаимодействии. Это позволяет
//  проверять, что метод был вызван с определенными аргументами. Шпионы могут
//  возвращать реальные значения или использовать заглушки для контроля ответов.
//  Шпионы используются, когда нам нужно проверить
//  вызовы методов и получить информацию о том как объект взаимодействует с другими
//  компонентами, шпионы используются в больших программах, записывает информацию
//  как логи (получаются большие файлы, которые мы потом анализируем).
//

//3) Какой тип тестовой заглушки следует использовать, если вам
// просто нужно вернуть определенное значение или исключение в
// ответ на вызов метода?

//  stub - задают фиксированные возвращаемые значения для вызовов методов.
//  Удобны при тестировании, когда требуется просто возвращать значение без сложной
//  логики или внешних зависимостей.
//
//  fake - реализуют упрощенную версию реального объекта или интерфейса.
//  Они могут использоваться для иммитации внешних зависимостей, таких как БД или
//  внешнее API. Фейки могут предоставлять фиксированные данные, с помощью которых
//  можно тестировать функциональность, зависимую от этих внешних ресурсов.



//4) Какой тип тестовой заглушки вы бы использовали для имитации
// взаимодействия с внешним API или базой данных?

//    fake - могут воссоздавать поведение внешних зависимостей и предоставлять
//    фиксированные данные для тестирования модуля, который использует эти зависимости.
//    Фэйк БД - объект, хранящий данные в памяти и предоставляет их для
//    тестирования модуля.
//    Фэйк это заглушка, которая в отличие от stub имеет упрощенную реализацию
//    (стаб просто возвращает значение не имея в себе реализацию)

}
