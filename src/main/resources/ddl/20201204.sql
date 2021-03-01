--
CREATE INDEX "persion_building_sfhm_index" ON "public"."person_building" USING btree (
  "sfhm",
  "building_id"
)

--
CREATE INDEX "tp_population_sfzh_index" ON "public"."tp_basic_population" USING btree (
  "sfzh"
)

-- 把所有ldrk的户号更新为null
update tp_basic_population set hh = null where rylx = 'ldrk'

--  (可选)更改坐标系
-- select st_srid(geom) from  cf_shequ
-- select updategeometrysrid('cf_shequ', 'geom', 4490)


--  残疾人表增加 geom 和 centerPoint字段
ALTER TABLE "public"."disabled_population"
  ADD COLUMN "geom" "public"."geometry" DEFAULT NULL,
  ADD COLUMN "center_point" varchar(255)

-- 更新数据
UPDATE "disabled_population" t set "geom" = ST_GeomFromText('POINT('||t."lon"||' '||t."lat"||')',4490)
update "disabled_population" t  set  "center_point" = st_astext(ST_centroid(t.geom))


--  低保户表增加 geom 和 centerPoint字段
ALTER TABLE "public"."dbh_population"
  ADD COLUMN "geom" "public"."geometry" DEFAULT NULL,
  ADD COLUMN "center_point" varchar(255);

-- 低保户更新数据
UPDATE "dbh_population" t set "geom" = ST_GeomFromText('POINT('||t."lon"||' '||t."lat"||')',4490);
update "dbh_population" t  set  "center_point" = st_astext(ST_centroid(t.geom));


--  五保户增加 geom 和 centerPoint字段
ALTER TABLE "public"."wbh_population"
  ADD COLUMN "geom" "public"."geometry" DEFAULT NULL,
  ADD COLUMN "center_point" varchar(255);

-- 五保户更新数据
UPDATE "wbh_population" t set "geom" = ST_GeomFromText('POINT('||t."lon"||' '||t."lat"||')',4490);
update "wbh_population" t  set  "center_point" = st_astext(ST_centroid(t.geom));


--  低保边缘增加 geom 和 centerPoint字段
ALTER TABLE "public"."dbby_population"
  ADD COLUMN "geom" "public"."geometry" DEFAULT NULL,
  ADD COLUMN "center_point" varchar(255);

-- 低保边缘更新数据
UPDATE "dbby_population" t set "geom" = ST_GeomFromText('POINT('||t."lon"||' '||t."lat"||')',4490);
update "dbby_population" t  set  "center_point" = st_astext(ST_centroid(t.geom));


--  死亡人口增加 geom 和 centerPoint字段
ALTER TABLE "public"."swrk_population"
  ADD COLUMN "geom" "public"."geometry" DEFAULT NULL,
  ADD COLUMN "center_point" varchar(255);

-- 死亡人口更新数据
UPDATE "swrk_population" t set "geom" = ST_GeomFromText('POINT('||t."lon"||' '||t."lat"||')',4490);
update "swrk_population" t  set  "center_point" = st_astext(ST_centroid(t.geom));



-- 更细总体的数据
-- UPDATE "tp_basic_population_all" t set "geom" = ST_GeomFromText('POINT('||t."lon"||' '||t."lat"||')',4490);
-- update "tp_basic_population_all" t  set  "center_point" = st_astext(ST_centroid(t.geom));
update tp_basic_population_all t set rylx = 'hjrk' where rylx = 'hjrk_all';
update tp_basic_population_all t set rylx = 'ldrk' where rylx = 'ldrk_all';


-- 添加中间表索引
CREATE INDEX "person_building_sfhm_building_index" ON "public"."person_building" USING btree (
  "sfhm",
  "building_id"
)

------2020-12-20 增加索引
CREATE INDEX "tp_basic_population_all_xm_index" ON "public"."tp_basic_population_all" USING btree (
  "xm" COLLATE "pg_catalog"."default" "pg_catalog"."text_ops" ASC NULLS LAST
);


CREATE INDEX "tp_basic_population_all_xb_index" ON "public"."tp_basic_population_all" USING btree (
  "xb" COLLATE "pg_catalog"."default" "pg_catalog"."text_ops" ASC NULLS LAST
);

CREATE INDEX "tp_basic_population_all_hjdz_index" ON "public"."tp_basic_population_all" USING btree (
  "hjdz" COLLATE "pg_catalog"."default" "pg_catalog"."text_ops" ASC NULLS LAST
);


