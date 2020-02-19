package com.sapient.soap.junit.test;
import  org.junit.Assert;

import java.time.chrono.IsoChronology;
import java.util.List;

import org.junit.Test;

import com.sapient.soap.test.ArrayOftContinent;
import com.sapient.soap.test.ArrayOftCurrency;
import com.sapient.soap.test.CapitalCity;
import com.sapient.soap.test.CountryISOCode;
import com.sapient.soap.test.CountryInfoService;
import com.sapient.soap.test.CountryInfoServiceSoapType;
import com.sapient.soap.test.TContinent;
import com.sapient.soap.test.TCurrency;
import com.sapient.soap.test.CapitalCityResponse;
public class SoapTest {
	
	@Test
	public void testCountryCode()
	{
		CountryInfoService countryInfoServices=new CountryInfoService();
		CountryInfoServiceSoapType  countryInfoServiceSoap=countryInfoServices.getCountryInfoServiceSoap();
		ArrayOftContinent continents= countryInfoServiceSoap.listOfContinentsByName();
		List<TContinent> listOfContinents=continents.getTContinent();
		Assert.assertEquals(6, listOfContinents.size());
	}
	
	@Test
	public void testCapitalCity()
	{
		CountryInfoService countryInfoServices=new CountryInfoService();
		CountryInfoServiceSoapType  countryInfoServiceSoap=countryInfoServices.getCountryInfoServiceSoap();
		String ans  = countryInfoServiceSoap.capitalCity("IN");
		Assert.assertEquals(ans, "New Delhi");
	}
	
	@Test
	public void testListOfCurrenciesByName()
	{
		CountryInfoService countryInfoServices=new CountryInfoService();
		CountryInfoServiceSoapType  countryInfoServiceSoap=countryInfoServices.getCountryInfoServiceSoap();
	ArrayOftCurrency currency=countryInfoServiceSoap.listOfCurrenciesByName();
	List<TCurrency> listOfCurrency=currency.getTCurrency();
	Assert.assertEquals(175, listOfCurrency.size());
	}
	
	public void testFullCountryInfo()
	{
		
	}

}
