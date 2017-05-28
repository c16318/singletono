


/**
 * 
 * 
 *
 * アイスクリームを作るためのミキサーのコントローラー
 * 製造上の問題が起きないように、
 * Singletonに書き換える。
 * @author c16318
 */
public class IceCreamMixer {
    private static IceCreamMixer icecreamixer = new IceCreamMixer();
    
    private boolean empty;  //ミキサーが空
    private boolean mixed;  //攪拌完了
    
    private IceCreamMixer(){
        empty = true;   //空
        mixed = false;  //未完了
        System.out.println("インスタンスを生成。");
    }
    
    public static IceCreamMixer getIceCreamMixer(){
            return icecreamixer;
    }
    
    //ミキサーを材料で満たす
    public void fill(){
        //空ならば材料で満たす
        if(isEmpty()){
            System.out.println("材料を入れる。");
            empty = false;
        }
        else{
            System.out.println("空ではありません。");
        }
        
    }
    
    //ミキサーから攪拌したものを取り出す
    public void drain(){
        //空じゃなくて、攪拌済みなら取り出す
        if(!isEmpty() && isMixed()){
            System.out.println("取り出す。");
            empty = true;
            mixed = false;
        }
        else if(isEmpty()){
            System.out.println("空です。");
        }
        else if(!isMixed()){
            System.out.println("未攪拌です。");
        }
    }
    
    //攪拌する
    public void mixer(){
        //空じゃなくて、未攪拌なら攪拌
        if(!isEmpty() && !isMixed()){
            System.out.println("攪拌する。");
            mixed = true;
        }
        else if(isEmpty()){
            System.out.println("材料が入ってないです。");
        }
        else if(isMixed()){
            System.out.println("攪拌済みです。");
        }
    }
    
    public boolean isEmpty(){
        return empty;
    }
    public boolean isMixed(){
        return mixed;
    }
    
    
}
