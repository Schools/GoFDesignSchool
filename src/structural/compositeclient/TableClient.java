package structural.compositeclient;

import structural.businessobjects.TableRow;
import structural.composite.Table;



public class TableClient {

	public static void main(String[] args) {
		TableRow row1 = new TableRow();
		TableRow row2 = new TableRow();
		TableRow row3 = new TableRow();
		TableRow row4 = new TableRow();
		TableRow row5 = new TableRow();
		TableRow row6 = new TableRow();
		
		Table table1 = new Table();
		Table table2 = new Table();
		Table table3 = new Table();
		table1.add(row1);
		table1.add(row2);
		table1.add(row3);
		table2.add(row4);
		table2.add(row5);
		table3.add(row6);
		table3.add(table1);
		table3.add(table2);
		
		table3.assemble();
	}
	
}
