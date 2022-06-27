package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags="@db",
        dryRun = false

)
public class TestRunner {
   /*
Bir frameworkte bir tek Runner Class'i yeterli olabilir.
Runner class'inda hic bir sey olmaz
Runner classimizi onemli yapan iki adet annotain vardir
@RunWith(Cucumber.class) notasyonu Runner Class'ina calsima ozelligi katar
Bu notasyon oldugu icin Cucumber framework'umuzde JUnit kullanmayi tercih ediyoruz

features : Runner dosyasinin feature dosyalarini nereden bulacagini tarif eder
glue : step definitions dosyalarini nerede bulacagimizi gosterir
tags : o an hangi tag'i calsitirmak istiyorsak onu belli eder

dryRun : iki secenek var
dryRun=true; yazdigimizda Testimizi calistirmadan sadece eksik adimlari bize verir.
dryRun=false; yazdığımızda testimizi çalıştırır.

 */
}