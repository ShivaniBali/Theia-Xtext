package org.xtext.example.mydsl.ide.tests

import org.eclipse.xtext.testing.AbstractLanguageServerTest
import org.junit.Test
import org.junit.Assert

class LanguageServerTest extends AbstractLanguageServerTest {
	new() {
	super("mydsl")
}
 					
@Test
def void test01_initialization() {
	val capabilities = initialize().capabilities
	Assert.assertTrue(
    	capabilities.definitionProvider && capabilities.documentFormattingProvider)
}

@Test
def void test02_openFile() {
	initialize()
	
	val file = 'hello.mydsl'.writeFile("")
	file.open('''
		Hello Xtext!
	''')
	
	Assert.assertTrue("There're issues in file 'hello.mydsl'.", diagnostics.get(file).empty)	
}
@Test
def void test03_completion() {
	testCompletion [
	    model = 'He'
	    line = 0
	    column = 2
		expectedCompletionItems = '''
			Hello -> Hello [[0, 0] .. [0, 2]]
		'''
	]
}
}