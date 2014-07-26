package structural.composite;

import java.util.ArrayList;
import java.util.List;

import structural.businessobjects.TableGroup;

public class Table implements TableGroup {

	List<TableGroup> tableGroups = new ArrayList<TableGroup>();

	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		System.out.println("<TABLE>");
		for (TableGroup tableGroup : tableGroups) {
			tableGroup.assemble();
		}
		System.out.println("</TABLE>");
	}

	public void add(TableGroup tableGroup) {
		// TODO Auto-generated method stub
		tableGroups.add(tableGroup);
	}

	
	public void remove(TableGroup tableGroup) {
		// TODO Auto-generated method stub
		tableGroups.remove(tableGroup);
	}

	public void getChilds(TableGroup tableGroup) {
		// TODO Auto-generated method stub
		for (TableGroup tableGroup2 : tableGroups) {
			tableGroup2.assemble();
		}
	}
}
