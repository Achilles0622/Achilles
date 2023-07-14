 案例 查询表中各个列别中 价格最高的商品
 先得到每个类别 最高商品
 SELECT cat_id,MAX(shou_price) FROM ecs_goods GROUP BY cat_id
  SELECT goods_id,cat_id,goods_name,shop_price FROM ecs_goods;
	  SELECT goods_id,cat_id,goods_name,shop_price FROM ecs_goods;