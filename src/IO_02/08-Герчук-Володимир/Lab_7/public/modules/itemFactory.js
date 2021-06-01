import Accessorie from './items/accessories';
import Peony from './items/peony';
import Rose from './items/rose';
import Snowdrop from './items/snowdrop';
const itemFactory = {
    createAccessory: (stats) => new Accessorie(stats),
    growPeony: (stats) => new Peony(stats),
    growRose: (stats) => new Rose(stats),
    growSnowdrop: (stats) => new Snowdrop(stats)
};
export default itemFactory;
