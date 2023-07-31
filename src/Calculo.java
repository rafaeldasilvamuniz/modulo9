/**Classe para o cálculo da média dos valores.
 *@author : Rafael da Silva Muniz
 *@since : 26/07/23
 */

public class Calculo {

    private float md = 0.0f;

    private float n1 = 10.0f;
    private float n2 = 30.0f;
    private float n3 = 50.0f;
    private float n4 = 80.0f;

    public float retornaMedia() {

        md = (n1 + n2 + n3 + n4)/4;
        return md;

    }


}
