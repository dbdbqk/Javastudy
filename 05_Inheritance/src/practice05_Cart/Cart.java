package practice05_Cart;

public class Cart {

	//필드
	
	private Product[] products;		// 배열 선언
	private int prodCount;			// 실제로 products 배열에 저장된 product의 갯수
	
	// new Cart(10), new Cart(20), ...
	public Cart(int cartSize) {
		products = new Product[cartSize]; // 배열 생성
		prodCount = 0;
	}

	// 메소드
	
	public Product[] getProducts() {
		return products;
	}
	
	public void setProducts(Product[] products) {
		this.products = products;
	}
	
	public int getProdCount() {
		return prodCount;
	}
	
	public void setProdCount(int prodCount) {
		this.prodCount = prodCount;
	}
	
	
	// 카트에 물건 담기
	// addProduct(new Meat(1, "소고기", 5000))
	// addProduct (new Pizza(2, "고구마피자", 3000))
	// addProduct (new Noddle(3, "누들면", 1500))
	public void addProduct(Product product) {
		
		//카트가 가득 차면 물건을 담지 못한다.
		if(products.length == prodCount) {
			System.out.println("키트가 가득 찼습니다.");
			return;
		}
		
		// 카트에 물건 담기
		products[prodCount++] = product;
		
	}
	// 카트에서 물건 빼기
	// deleteProduct(1)
	// deleteProduct(2)
	// deleteProduct(3)
	public void deleteProduct(int prodNo) {
		
		// 카트가 비어 있으면 뺄 물건이 없다.
		if(prodCount == 0) {
			System.out.println("카트가 비어있습니다.");
			return;
		}
		// 카트에서 물건 뺴기
		for(int i = 0; i < prodCount; i++) {
			if(products[i].getProdNo() == prodNo) { 			// 카트에 저장 되어있는 물건의 제품 번호
				products[i] = products[--prodCount];	// 마지막 물건을 뺀 물건 자리로 옮기기, 카운트에 -1 저장
				break;
			}
		}
		
	}
	
	
	
	
	}
	
	
	
	
	
