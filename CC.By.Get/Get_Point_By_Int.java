package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Int$Point;

public interface Get_Point_By_Int<Valu_Typ> extends
	Get_Q_By_Int,
	Get_Point_By_Q<Valu_Typ>,
	Int$Point<Valu_Typ>
{
	@Lin_Dclar
	Valu_Typ Get_Point_By_Int(int By);
		@Override
		@Nevr_Neds_Ovrid
		default Valu_Typ Int$Point(int In){return Get_Point_By_Int(In);}
}