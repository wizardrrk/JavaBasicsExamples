package com.wiz.inheritance;


public class TestInheritanceRelationship {

	Parent p = new Child();

	public static void main(String args[]) {
		TestInheritanceRelationship t = new TestInheritanceRelationship();
		// available as its own method
		t.p.p1();
		// not available, as child method to parent unidirectional
		// relation(Aggregation Principle : OOps relationship Concept - parent to child
		// is unidirectional)
		// t.p.c1();

		// alternatively cast the parent to child object then we can get the child
		// property. (OOPs L of SOLID design principle ' Liskov Substitution' - if class
		// A is a subtype of class B, we should be able to replace B with A without
		// disrupting the behavior of our program)
		((Child) t.p).c1();
	}
}
