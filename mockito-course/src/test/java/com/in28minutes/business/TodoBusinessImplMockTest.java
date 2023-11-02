package com.in28minutes.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.in28minutes.data.api.TodoService;

public class TodoBusinessImplMockTest {

	/**
	 * Mocking is creating objects that simulate the behavior of real objects.
	 * Unlike stubs, mocks can be dinamically created from code - at runtime. Mocks
	 * offer more functionaliy than stubbing.
	 **/

	@Test
	public void testRetrieveTodosRelatedSpring_usingAMock() {
		TodoService mockService = mock(TodoService.class);
		
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn Programming");
		
		TodoBusinessImpl todoImp = new TodoBusinessImpl(mockService);
		List<String> filteredTodos = todoImp.retrieveTodosRelatedToSpring("UserTest");
		assertEquals(2, filteredTodos.size());
	}

}
