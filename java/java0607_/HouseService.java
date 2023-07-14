package java0607_;

public class HouseService {//
    private House[] houses;
    private int houseNums = 1;
    private int idCounter = 1;

    HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1, "jack", "112", "吉林省长春市", 2000, "卫出租");
    }
    public House findById(int findId){
        //遍历数组
        for (int i = 0; i <houseNums ; i++) {
            if(findId==houses[i].getId()){
                return houses[i];
            }
        }
return null;

    }
public boolean del(int delId){
        int index=-1;
    for (int i = 0; i <houseNums ; i++) {
        if(delId==houses[i].getId()){

        }
    }
    if(index == -1) {
return false;
    }
    for(int i =index;i<houseNums-1;i++){
        houses[i]=houses[i+1];
    }
    houses[houseNums-1]=null;
    houseNums--;
    return  true;
}
    public boolean add(House newHouse) {
        if (houseNums == houses.length) {
            System.out.println("数组已满");
            return false;
        }
        houses[houseNums++] = newHouse;
        newHouse.setId(++idCounter);
        return true;
    }

    public House[] list() {
        return houses;
    }
}
