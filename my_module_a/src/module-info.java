module my_module_a {
	exports pack1;
//	exports pack2;
	opens pack2 to my_application_2;
	requires transitive my_module_b;
}