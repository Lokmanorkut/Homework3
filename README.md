# Homework3
It is the repository of the homework for the Java Spring Boot course. The subject of the homework is about the basics of Object-oriented programming and explaining Abstract and Interface concepts.



### Abstract Class Interface Genel Bakış
* (Örnekler AbstractInterface package içinde bulunmaktadır)


# Abstract Class
* Soyut(Abstract) sınıflar,ortak özellikleri ve işlevleri paylaşan sınıfların temelini oluşturur.Abstract anahtar kelimesi ile tanımlanır. (örn. abstract class className{})

* Soyut metotlar içerebilir.Soyut metotlar bir gövdeye sahip olmazlar sadece metodun imzasını taşıyabilirler.Soyut metotların,Abstract Class'ı miras alan classlarda Override edilmesi zorunludur.

* Normal gövdeye sahip metotlarda içerebilirler

* Değişkenler tanımlanabilir(instance variables)

* Yapıcı Metotlar içerebilirler

* extends anahtar kelimesiyle beraber abstract classın özelliklerini miras alırlar.Bir Sınıf Yalnızca bir tane abstract class'ı miras alabilir (Java Çoklu kalıtım içermez Python,C#,C++ gibi yazılım dilleri ise Çoklu kalıtım yapısını destekler)

* Metotlar public private ya da protected olabilir.

# Interface
* Arayüz(Interface),sınıfların belirli bir işlevselliği uygulamasını sağlamak için kullanılır.Sadece metot imzaları içerirken java8 ve sonrasıyla beraber default ve static olarak metot gövdelerini içerebilirler

* Tüm metotlar otomatik olarak public(java9 sonrası private da olabilir) abstract olur.

* Tüm değişkenler otomatik olarak public static final olur yani sabittir ve değiştirilemez.

* implements anahtar kelimesiyle kalıtım sağlarlar

* Bir sınıf birden fazla interface'i implement alabilir.Böylece Java'da çoklu kalıtımı desteklemek için kullanılabilirler.

* Yapıcı metot içeremezler
