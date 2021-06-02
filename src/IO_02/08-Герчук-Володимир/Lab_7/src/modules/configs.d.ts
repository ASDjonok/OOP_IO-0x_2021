interface FlowerConstructorConf {
  len: number;
  color: string;
  freshness: string;
}

interface FlowerConstructorWithKoef extends FlowerConstructorConf {
  K: number;
}
interface AccessorieConstructorConf {
  name: string;
  price: number;
}
