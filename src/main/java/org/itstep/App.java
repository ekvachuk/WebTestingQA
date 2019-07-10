package org.itstep;

import org.itstep.service.DataExraction;
import org.itstep.service.PromDataExtraction;


public class App 
{
    public static void main( String[] args )
    {
        String url = "https://prom.ua/ua/p776457480-omen-8750h16g2561tb-gtx1060.html";
        DataExraction promExtraction = new PromDataExtraction();

        System.out.println( promExtraction.getItemFromProductUrl(url).getName());
    }
}
