package org.xlsx;

import java.io.FileNotFoundException;

import org.nutz.lang.Streams;

public class XLSXResourceTest {
	public static void main(String[] args) throws FileNotFoundException {

		StreamXLSXResource xlsxResource = new StreamXLSXResource(Streams.fileIn("test/test.xlsx"));
		System.out.println(xlsxResource.has("Sheet1"));
	}

}
