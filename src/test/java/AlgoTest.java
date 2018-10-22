package test.java;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {

	Item[] sortedVec = new Item[]{new Item(1),new Item(2),new Item(3),new Item(4),new Item(5)};
	// this test case is for Node Coverage test case 1 and Edge Coverage test case 1
	@SuppressWarnings("static-access")
	@Test
	public void bubbleSortOverAll() {
		SortAlgos sortAlgos = new SortAlgos();
		
		Item[] vec = new Item[]{new Item(5),new Item(4),new Item(3),new Item(2),new Item(1)};
		sortAlgos.bubbleSort(vec);
	
		assertTrue(sortedVec[0].key == vec[0].key);
		assertTrue(sortedVec[1].key == vec[1].key);
		assertTrue(sortedVec[2].key == vec[2].key);
		assertTrue(sortedVec[3].key == vec[3].key);
		assertTrue(sortedVec[4].key == vec[4].key);
		
	}
	
	// this test case  Edge Coverage test case 2 and Condition coverage test 3
	@SuppressWarnings("static-access")
	@Test
	public void bubbleSortSortedInput() {
		SortAlgos sortAlgos = new SortAlgos();
		
		Item[] vec = new Item[]{new Item(1),new Item(2),new Item(3),new Item(4),new Item(5)};
		sortAlgos.bubbleSort(vec);
	
		assertTrue(sortedVec[0].key == vec[0].key);
		assertTrue(sortedVec[1].key == vec[1].key);
		assertTrue(sortedVec[2].key == vec[2].key);
		assertTrue(sortedVec[3].key == vec[3].key);
		assertTrue(sortedVec[4].key == vec[4].key);
		
	}
	
	// this test case  Edge Condition coverage test 1
		@SuppressWarnings("static-access")
		@Test
		public void bubbleSortException() {
			SortAlgos sortAlgos = new SortAlgos();
			
			try {
				sortAlgos.bubbleSort(null);
			} catch (NullPointerException e) {
				assertNull(e.getMessage());
			}
			
		}
		
		// this test case  Edge Condition coverage test 2
				@SuppressWarnings("static-access")
				@Test
				public void bubbleSortSingleInput() {

					SortAlgos sortAlgos = new SortAlgos();
					
					Item[] vec = new Item[]{new Item(5)};
					sortAlgos.bubbleSort(vec);
				
					assertTrue(5 == vec[0].key);
					
					
				
				}
		//Selection Sort
				
				@SuppressWarnings("static-access")
				@Test
				public void selectionSortOverAll() {
					SortAlgos sortAlgos = new SortAlgos();
					
					Item[] vec = new Item[]{new Item(5),new Item(4),new Item(3),new Item(2),new Item(1)};
					sortAlgos.selectionSort(vec);
				
					assertTrue(sortedVec[0].key == vec[0].key);
					assertTrue(sortedVec[1].key == vec[1].key);
					assertTrue(sortedVec[2].key == vec[2].key);
					assertTrue(sortedVec[3].key == vec[3].key);
					assertTrue(sortedVec[4].key == vec[4].key);
					
				}
				
				// this test case  Edge Coverage test case 2 and Condition coverage test 3
				@SuppressWarnings("static-access")
				@Test
				public void selectionSortSortedInput() {
					SortAlgos sortAlgos = new SortAlgos();
					
					Item[] vec = new Item[]{new Item(1),new Item(2),new Item(3),new Item(4),new Item(5)};
					sortAlgos.selectionSort(vec);
				
					assertTrue(sortedVec[0].key == vec[0].key);
					assertTrue(sortedVec[1].key == vec[1].key);
					assertTrue(sortedVec[2].key == vec[2].key);
					assertTrue(sortedVec[3].key == vec[3].key);
					assertTrue(sortedVec[4].key == vec[4].key);
					
				}
				
				// this test case  Edge Condition coverage test 1
					@SuppressWarnings("static-access")
					@Test
					public void selectionSortException() {
						SortAlgos sortAlgos = new SortAlgos();
						
						try {
							sortAlgos.selectionSort(null);
						} catch (NullPointerException e) {
							assertNull(e.getMessage());
						}
						
					}
					
					// this test case  Edge Condition coverage test 2
							@SuppressWarnings("static-access")
							@Test
							public void selectionSortSingleInput() {

								SortAlgos sortAlgos = new SortAlgos();
								
								Item[] vec = new Item[]{new Item(5)};
								sortAlgos.selectionSort(vec);
							
								assertTrue(5 == vec[0].key);
								
								
							
							}
		//Insertion Sort
							
							@SuppressWarnings("static-access")
							@Test
							public void insertionSortOverAll() {
								SortAlgos sortAlgos = new SortAlgos();
								
								Item[] vec = new Item[]{new Item(5),new Item(4),new Item(3),new Item(2),new Item(1)};
								sortAlgos.insertionSort(vec);
							
								assertTrue(sortedVec[0].key == vec[0].key);
								assertTrue(sortedVec[1].key == vec[1].key);
								assertTrue(sortedVec[2].key == vec[2].key);
								assertTrue(sortedVec[3].key == vec[3].key);
								assertTrue(sortedVec[4].key == vec[4].key);
								
							}
							
							// this test case  Edge Coverage test case 2 and Condition coverage test 3
							@SuppressWarnings("static-access")
							@Test
							public void insertionSortSortedInput() {
								SortAlgos sortAlgos = new SortAlgos();
								
								Item[] vec = new Item[]{new Item(1),new Item(2),new Item(3),new Item(4),new Item(5)};
								sortAlgos.insertionSort(vec);
							
								assertTrue(sortedVec[0].key == vec[0].key);
								assertTrue(sortedVec[1].key == vec[1].key);
								assertTrue(sortedVec[2].key == vec[2].key);
								assertTrue(sortedVec[3].key == vec[3].key);
								assertTrue(sortedVec[4].key == vec[4].key);
								
							}
							
							// this test case  Edge Condition coverage test 1
								@SuppressWarnings("static-access")
								@Test
								public void sinsertionSortException() {
									SortAlgos sortAlgos = new SortAlgos();
									
									try {
										sortAlgos.insertionSort(null);
									} catch (NullPointerException e) {
										assertNull(e.getMessage());
									}
									
								}
								
								// this test case  Edge Condition coverage test 2
										@SuppressWarnings("static-access")
										@Test
										public void insertionSortSingleInput() {

											SortAlgos sortAlgos = new SortAlgos();
											
											Item[] vec = new Item[]{new Item(5)};
											sortAlgos.insertionSort(vec);
										
											assertTrue(5 == vec[0].key);
											
											
										
										}
										
				//Merge Sort
										
										@SuppressWarnings("static-access")
										@Test
										public void mergeSortOverAll() {
											SortAlgos sortAlgos = new SortAlgos();
											
											Item[] vec = new Item[]{new Item(5),new Item(4),new Item(3),new Item(2),new Item(1)};
											sortAlgos.mergeSort(vec);
										
											assertTrue(sortedVec[0].key == vec[0].key);
											assertTrue(sortedVec[1].key == vec[1].key);
											assertTrue(sortedVec[2].key == vec[2].key);
											assertTrue(sortedVec[3].key == vec[3].key);
											assertTrue(sortedVec[4].key == vec[4].key);
											
										}
										
										// this test case  Edge Coverage test case 2 and Condition coverage test 3
										@SuppressWarnings("static-access")
										@Test
										public void mergeSortSortedInput() {
											SortAlgos sortAlgos = new SortAlgos();
											
											Item[] vec = new Item[]{new Item(1),new Item(2),new Item(3),new Item(4),new Item(5)};
											sortAlgos.mergeSort(vec);
										
											assertTrue(sortedVec[0].key == vec[0].key);
											assertTrue(sortedVec[1].key == vec[1].key);
											assertTrue(sortedVec[2].key == vec[2].key);
											assertTrue(sortedVec[3].key == vec[3].key);
											assertTrue(sortedVec[4].key == vec[4].key);
											
										}
										
										// this test case  Edge Condition coverage test 1
											@SuppressWarnings("static-access")
											@Test
											public void mergeSortException() {
												SortAlgos sortAlgos = new SortAlgos();
												
												try {
													sortAlgos.mergeSort(null);
												} catch (NullPointerException e) {
													assertNull(e.getMessage());
												}
												
											}
											
											// this test case  Edge Condition coverage test 2
													@SuppressWarnings("static-access")
													@Test
													public void mergeSortSingleInput() {

														SortAlgos sortAlgos = new SortAlgos();
														
														Item[] vec = new Item[]{new Item(5)};
														sortAlgos.mergeSort(vec);
													
														assertTrue(5 == vec[0].key);
														
														
													
													}
							//quickSort						
													@SuppressWarnings("static-access")
													@Test
													public void quickSortOverAll() {
														SortAlgos sortAlgos = new SortAlgos();
														
														Item[] vec = new Item[]{new Item(5),new Item(4),new Item(3),new Item(2),new Item(1)};
														sortAlgos.quickSort(vec);
													
														assertTrue(sortedVec[0].key == vec[0].key);
														assertTrue(sortedVec[1].key == vec[1].key);
														assertTrue(sortedVec[2].key == vec[2].key);
														assertTrue(sortedVec[3].key == vec[3].key);
														assertTrue(sortedVec[4].key == vec[4].key);
														
													}
													
													// this test case  Edge Coverage test case 2 and Condition coverage test 3
													@SuppressWarnings("static-access")
													@Test
													public void quickSortSortedInput() {
														SortAlgos sortAlgos = new SortAlgos();
														
														Item[] vec = new Item[]{new Item(1),new Item(2),new Item(3),new Item(4),new Item(5)};
														sortAlgos.quickSort(vec);
													
														assertTrue(sortedVec[0].key == vec[0].key);
														assertTrue(sortedVec[1].key == vec[1].key);
														assertTrue(sortedVec[2].key == vec[2].key);
														assertTrue(sortedVec[3].key == vec[3].key);
														assertTrue(sortedVec[4].key == vec[4].key);
														
													}
													
													// this test case  Edge Condition coverage test 1
														@SuppressWarnings("static-access")
														@Test
														public void quickSortException() {
															SortAlgos sortAlgos = new SortAlgos();
															
															try {
																sortAlgos.quickSort(null);
															} catch (NullPointerException e) {
																assertNull(e.getMessage());
															}
															
														}
														
														// this test case  Edge Condition coverage test 2
																@SuppressWarnings("static-access")
																@Test
																public void quickSortSingleInput() {

																	SortAlgos sortAlgos = new SortAlgos();
																	
																	Item[] vec = new Item[]{new Item(5)};
																	sortAlgos.quickSort(vec);
																
																	assertTrue(5 == vec[0].key);
																	
																	
																
																}
					//heapSort
																@SuppressWarnings("static-access")
																@Test
																public void heapSortOverAll() {
																	SortAlgos sortAlgos = new SortAlgos();
																	
																	Item[] vec = new Item[]{new Item(5),new Item(4),new Item(3),new Item(2),new Item(1)};
																	sortAlgos.heapSort(vec);
																
																	assertTrue(sortedVec[0].key == vec[0].key);
																	assertTrue(sortedVec[1].key == vec[1].key);
																	assertTrue(sortedVec[2].key == vec[2].key);
																	assertTrue(sortedVec[3].key == vec[3].key);
																	assertTrue(sortedVec[4].key == vec[4].key);
																	
																}
																
																// this test case  Edge Coverage test case 2 and Condition coverage test 3
																@SuppressWarnings("static-access")
																@Test
																public void heapSortSortedInput() {
																	SortAlgos sortAlgos = new SortAlgos();
																	
																	Item[] vec = new Item[]{new Item(1),new Item(2),new Item(3),new Item(4),new Item(5)};
																	sortAlgos.heapSort(vec);
																
																	assertTrue(sortedVec[0].key == vec[0].key);
																	assertTrue(sortedVec[1].key == vec[1].key);
																	assertTrue(sortedVec[2].key == vec[2].key);
																	assertTrue(sortedVec[3].key == vec[3].key);
																	assertTrue(sortedVec[4].key == vec[4].key);
																	
																}
																
																// this test case  Edge Condition coverage test 1
																	@SuppressWarnings("static-access")
																	@Test
																	public void heapSortException() {
																		SortAlgos sortAlgos = new SortAlgos();
																		
																		try {
																			sortAlgos.heapSort(null);
																		} catch (NullPointerException e) {
																			assertNull(e.getMessage());
																		}
																		
																	}
																	
																	// this test case  Edge Condition coverage test 2
																			@SuppressWarnings("static-access")
																			@Test
																			public void heapSortSingleInput() {

																				SortAlgos sortAlgos = new SortAlgos();
																				
																				Item[] vec = new Item[]{new Item(5)};
																				sortAlgos.heapSort(vec);
																			
																				assertTrue(5 == vec[0].key);
																				
																				
																			
																			}
}
