

class QuickSort{
  private SmartPhone[] phones;

  public QuickSort(SmartPhone[] phones){
    this.phones = phones;
  }

  protected void sort(int low, int high){
    int i = low, j = high;
    float pivot = phones[(low + (high-low))/2].getOverallScore();
    while (i <= j){
      while (phones[i].getOverallScore() < pivot){
        i++;
      }
      while (phones[j].getOverallScore() > pivot){
        j--;
      }
      if (i <= j){
        exchange(i,j);
        i++;
        j--;
      }
    }
    if (low < j)
      sort(low,j);
    if (i < high)
      sort(i,high);
  }

  private void exchange(int i, int j){
    SmartPhone temp = phones[i];
    phones[i] = phones[j];
    phones[j] = temp;
  }
}

enum PhoneAttributes{
    TITLE,
    PRICE,
    PRICE_SCORE,
    APP,
    STYLE,
    SPEED,
    OVERALL_SCORE;
}

class SmartPhone{
  private static final float APP_WEIGHT = 0.3f;
  private static final float STYLE_WEIGHT = 0.3f;
  private static final float SPEED_WEIGHT = 0.4f;

  private int id;
  private String title;
  private float price;

  //price score needs to be derived
  private float priceScore;
  private float appScore;
  private float styleScore;
  private float speedScore;
  private float overallScore;

  public SmartPhone(int id, String title, float price, float appScore, float styleScore, float speedScore){
    this.id = id;
    this.title = title;
    this.price = price;
    this.appScore = appScore;
    this.styleScore = styleScore;
    this.speedScore = speedScore;
  }

  //Getters
  public int getId(){
    return id;
  }

  public String getTitle() {
    return title;
  }

  public float getPrice(){
    return price;
  }

  public float getPriceScore(){
    return priceScore;
  }

  public float getAppScore(){
    return appScore;
  }

  public float getStyleScore(){
    return styleScore;
  }

  public float getSpeedScore(){
    return speedScore;
  }

  public float getOverallScore(){
    return overallScore;
  }

  //Setters
  public void SetId(int id){
    this.id = id;
  }

  public void setTitle(String title){
    this.title = title;
  }

  public void setPrice(float price){
    this.price = price;
  }

  public void setPriceScore(float priceScore){
    this.priceScore = priceScore;
  }

  public void setAppScore(float appScore){
    this.appScore = appScore;
  }

  public void setStyleScore(float styleScore){
    this.styleScore = styleScore;
  }

  public void setSpeedScore(float speedScore){
    this.speedScore = speedScore;
  }

  public void setOverallScore(float overallScore){
    this.overallScore = overallScore;
  }

  public float getFeatureScore(){
    return APP_WEIGHT * this.getAppScore() +
          STYLE_WEIGHT * this.getStyleScore() +
          SPEED_WEIGHT * this.getSpeedScore();
  }
}

public class SmartPhoneComparator{
  private static final float MIN_SCORE = 0.0f;
  private static final float MAX_SCORE = 9.0f;

  public static void main(String[] args){
    SmartPhone phones[] = new SmartPhone[9];

    phones[0] = new SmartPhone(0,"Nokia Lumia",32000,7,8,7);
    phones[1] = new SmartPhone(1,"Galaxy S2",29000,9,7,6);
    phones[2] = new SmartPhone(2,"HTC One",18000,9,6,5);
    phones[3] = new SmartPhone(3,"Xperia Mini",13000,7,6,5);
    phones[4] = new SmartPhone(4,"Xperia Pro",18500,7,7,7);
    phones[5] = new SmartPhone(5,"Blackberry Bold",26500,6,6,7);
    phones[6] = new SmartPhone(6,"Nokia N8",19000,5,6,5);
    phones[7] = new SmartPhone(7,"Galaxy Note",33000,9,8,7);
    phones[8] = new SmartPhone(8,"Apple iPhone 4S",36000,9,9,8);

    SmartPhoneComparator comparator = new SmartPhoneComparator();

    comparator.calculateOverallScore(phones);
    comparator.sort(phones);
    comparator.suggest(phones,6);
    System.out.println();
  }

  private float getMaxPrice(SmartPhone[] smartPhones){
    float result = 0.0f;
    if (smartPhones == null || smartPhones.length < 1)
      return result;

    for(SmartPhone phone: smartPhones){
      if (phone.getPrice() > result)
        result = phone.getPrice();
    }
    return result;
  }

  private void calculateOverallScore(SmartPhone[] smartPhones){
    if (smartPhones == null || smartPhones.length < 1)
      return;

    float maxPrice = getMaxPrice(smartPhones);

    // First set the Price score which is not given
    for (SmartPhone phone: smartPhones){
      phone.setPriceScore(phone.getPrice() * MAX_SCORE/maxPrice);
    }

    // Now set the overall score
    for (SmartPhone phone: smartPhones){
      phone.setOverallScore((phone.getPriceScore() + phone.getFeatureScore())/2.0f);
    }
  }

  private void sort(SmartPhone[] smartPhones){
    if (smartPhones == null || smartPhones.length < 1)
      return;

    QuickSort sorter = new QuickSort(smartPhones);
    sorter.sort(0,smartPhones.length - 1);
  }

  private void suggest(SmartPhone[] smartPhones, int phoneId){
    if (smartPhones == null || smartPhones.length < 1 || phoneId < 0 || phoneId > smartPhones.length - 1)
      return;

    for (int i = 0; i < smartPhones.length; i++){
      if (smartPhones[i].getId() == phoneId){
        phoneId = i;
        break;
      }
    }

    int i=0;
    int prev1 = phoneId - 1;
    int prev2 = phoneId - 2;
    int next1 = phoneId + 1;
    int next2 = phoneId + 2;

    System.out.println("\nSmart phones similar(in price,app,style and speed) to '" + smartPhones[phoneId].getTitle() + "' are...\n\n");

    if(prev1>=0 && prev1<smartPhones.length) {
      System.out.println("("+ (++i) +") " + smartPhones[prev1].getTitle());
    }
    if(next1>=0 && next1<smartPhones.length) {
      System.out.println("("+ (++i) +") " + smartPhones[next1].getTitle());
    }
    if(prev2>=0 && prev2<smartPhones.length) {
      System.out.println("("+ (++i) +") " + smartPhones[prev2].getTitle());
    }
    if(next2>=0 && next2<smartPhones.length) {
      System.out.println("("+ (++i) +") " + smartPhones[next2].getTitle());
    }

  }
}
