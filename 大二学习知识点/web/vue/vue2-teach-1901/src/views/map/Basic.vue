<template>
  <div class="main">
    <div>
      <div id="map-container"></div>
    </div>
    <div>
      <input type="text" id="txtSearch" placeholder="地址搜索" />
    </div>
  </div>
</template>

<script>
// 高德地图pai对象
let AMap = window.AMap;
// 地图实例
let map = null;

export default {
  name: 'Test',
  data() {
    return {};
  },
  mounted() {
    // 创建地图
    map = new AMap.Map('map-container', {
      zoom: 15,
      // pitch: 75,
      // viewMode: '3D'
      mapStyle: 'amap://styles/fresh' //设置地图的显示样式
    });
    // 一些赌徒插件的使用
    AMap.plugin(['AMap.ToolBar', 'AMap.Geolocation', 'AMap.AutoComplete', 'AMap.PlaceSearch', 'AMap.Scale'], function() {
      // 添加控件
      map.addControl(
        new AMap.ToolBar({
          position: {
            top: '1rem',
            left: '1rem'
          }
        })
      );
      // 定位插件
      let geo = new AMap.Geolocation({
        // 是否使用高精度定位，默认：true
        enableHighAccuracy: false,
        // 设置定位超时时间，默认：无穷大
        timeout: 10000,
        // 定位按钮的停靠位置的偏移量，默认：Pixel(10, 20)
        buttonOffset: new AMap.Pixel(10, 20),
        //  定位成功后调整地图视野范围使定位位置及精度范围视野内可见，默认：false
        zoomToAccuracy: true,
        //  定位按钮的排放位置,  RB表示右下
        buttonPosition: 'RB'
      });

      // 获取当前地理位置信息
      geo.getCurrentPosition(function(status, result) {
        console.log('当前地址信息：', status, result);
        // 成功获取地址的情况
        if ('complete' == status) {
          // 获取坐标信息并创建坐标点
          let position = new AMap.LngLat(result.position.lng, result.position.lat);
          // 设置中心
          map.setCenter(position);
          // 标识点
          let marker = new AMap.Marker({ position: position, title: '我的位置' });
          map.add(marker);
        } else {
          console.error('定位异常', status, result);
        }
      });

      map.addControl(geo);

      // poi搜索和自动完成
      let auto = new AMap.AutoComplete({
        input: 'txtSearch',
        city: '常德'
      });
      let placeSearch = new AMap.PlaceSearch({
        map: map
      });
      // 自动完成事件监听
      auto.on('select', function(event) {
        placeSearch.setCity(event.poi.adcode);
        placeSearch.search(event.poi.name);
      });
      map.addControl(
        new AMap.Scale({
          position: {
            top: '1rem',
            right: '1rem'
          }
        })
      );
    });
  },
  destroyed() {
    // vue页面销毁时顺便销毁地图
    if (map) {
      map.destroy();
    }
  }
};
</script>

<style scoped>
.main {
  display: flex;
  flex-direction: column;
  height: 100vh;
  overflow: -Scroll;
  overflow-y: hidden;
}

.main > div:nth-child(1) {
  flex: 1;
}

.main > div:nth-child(2) {
  top: 1.7rem;
  left: 5rem;
  position: fixed;
}

.main > div:nth-child(2) input {
  padding: 0.5rem;
}

#map-container {
  width: 100%;
  height: 100%;
}
</style>
