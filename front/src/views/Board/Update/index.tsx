import React from 'react';
import './style.css';

//          component: 게시물 수정 화면          //
export default function BoardUpdate() {

  //          render: 게시물 수정 화면 렌더링          //
  return (
    <div id='board-write-wrapper'>
      <div className='board-write-container'>
        <div className='board-write-box'>
          <div className='board-write-title-box'>
            <input className='board-write-title-input' type='text' placeholder='제목을 작성해주세요.' />
          </div>
          <div className='divider'></div>
          <div className='board-write-contents-box'>
            <textarea className='board-write-contents-textarea' placeholder='본문을 작성해주세요.' />
            <div className='icon-button'>
              <div className='image-box-light-icon'></div>
            </div>
          </div>
          <div className='board-write-images-box'>
            <div className='board-write-image-box'>
              <img className='board-write-image' />
              <div className='icon-button image-close'>
                <div className='close-icon'></div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  )
}
