/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.xtext.example.mydsl.myDsl.Greeting;
import org.xtext.example.mydsl.myDsl.MyDslFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Greeting</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GreetingTest extends TestCase {

	/**
	 * The fixture for this Greeting test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Greeting fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GreetingTest.class);
	}

	/**
	 * Constructs a new Greeting test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreetingTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Greeting test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Greeting fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Greeting test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Greeting getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MyDslFactory.eINSTANCE.createGreeting());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //GreetingTest