package com.in28minutes.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.in28minutes.data.api.TodoService;
import com.in28minutes.data.api.TodoServiceStub;

public class TodoBusinessImplMockTest {

	@Test
	public void testRetrieveTodosRelatedSpring_usingAStub() {
		TodoService service = new TodoServiceStub();
		TodoBusinessImpl todoImp = new TodoBusinessImpl(service);
		List<String> filteredTodos = todoImp.retrieveTodosRelatedToSpring("UserTest");
		
		assertEquals(2, filteredTodos.size());
	}

}
