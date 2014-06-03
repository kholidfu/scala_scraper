import org.jsoup._
import org.jsoup.nodes._
import org.jsoup.select._
import scala.collection.JavaConverters._

object scraper {
  def main(args: Array[String]) {
    // set url
    val url = "http://allbookez.com/"
    // get the html Document
    val doc = Jsoup.connect(url).get()
    // parsing element
    val recents: Elements = doc.select(".moduleTitle")
    val nowLooking = recents.last()
    val nextSibling = nowLooking.nextElementSibling()
    val links = nextSibling.select("a")
    // convert java array to scala array and map it!
    links.asScala.map(link => link.text()).foreach(println)
    
  }
}
