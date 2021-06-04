import Accessorie from './items/accessories';
import Peony from './items/peony';
import Rose from './items/rose';
import Snowdrop from './items/snowdrop';

const itemFactory = {
  createAccessory: (stats: AccessorieConstructorConf) => new Accessorie(stats),
  growPeony: (stats: FlowerConstructorConf) => new Peony(stats),
  growRose: (stats: FlowerConstructorConf) => new Rose(stats),
  growSnowdrop: (stats: FlowerConstructorConf) => new Snowdrop(stats),
};

export default itemFactory;
